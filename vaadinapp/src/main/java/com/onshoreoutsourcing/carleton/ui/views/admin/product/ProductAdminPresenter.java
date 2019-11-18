package com.onshoreoutsourcing.carleton.ui.views.admin.product;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import com.onshoreoutsourcing.carleton.backend.data.entity.Product;
import com.onshoreoutsourcing.carleton.backend.service.ProductService;
import com.onshoreoutsourcing.carleton.ui.navigation.NavigationManager;
import com.onshoreoutsourcing.carleton.ui.views.admin.AbstractCrudPresenter;

@SpringComponent
@ViewScope
public class ProductAdminPresenter extends AbstractCrudPresenter<Product, ProductService, ProductAdminView> {

	@Autowired
	public ProductAdminPresenter(ProductAdminDataProvider productAdminDataProvider, NavigationManager navigationManager,
			ProductService service, BeanFactory beanFactory) {
		super(navigationManager, service, Product.class, productAdminDataProvider, beanFactory);
	}
}
