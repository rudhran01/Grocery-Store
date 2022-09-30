package com.edubridge.stores.service.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.stores.entity.Product;
import com.edubridge.stores.repository.ProductAdmRepository;
import com.edubridge.stores.service.ProductAdmService;

@Service
@Transactional
public class ProductAdmServiceImpl implements ProductAdmService
{
	@Autowired
	ProductAdmRepository productRepo;

	@Override
	public Product storeFile(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Optional<Product> getProductId(Long pid) {
		return productRepo.findById(pid);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public void deleteProduct(Long pid) {
		productRepo.deleteById(pid);
	}

	@Override
	public void deleteAll(List<Product> ids) {

	}

	@Override
	public Long countProduct() {
		return productRepo.count();
	}

}
