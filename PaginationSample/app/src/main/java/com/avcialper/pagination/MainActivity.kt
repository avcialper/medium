package com.avcialper.pagination

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.avcialper.pagination.adapter.footer.FooterAdapter
import com.avcialper.pagination.adapter.product.ProductAdapter
import com.avcialper.pagination.adapter.product.ProductComparator
import com.avcialper.pagination.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: ProductViewModel by viewModels()

    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initRecyclerView()
        initObserver()
    }

    private fun initRecyclerView() {
        val diffUtil = ProductComparator()
        productAdapter = ProductAdapter(diffUtil)
        val footerAdapter = FooterAdapter(productAdapter::retry)
        val layoutManager = LinearLayoutManager(this)
        binding.rvProducts.apply {
            this.adapter = productAdapter.withLoadStateFooter(footerAdapter)
            this.layoutManager = layoutManager
        }
    }

    private fun initObserver() {
        lifecycleScope.launch {
            viewModel.getProducts().collectLatest { pagingData ->
                productAdapter.submitData(pagingData)
            }
        }
    }
}