package cn.nlsde.repository.solr.dao;

import cn.nlsde.repository.solr.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.repository.Facet;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 * Created by zwj on 2016/3/11.
 */
public interface ProductRepository extends SolrCrudRepository<Product, String> {


    @Query("name:?0")
    @Facet(fields = {"name"}, limit = 5)
    FacetPage<Product> findByNameAndFacetOnCategories(String name, Pageable page);
}
