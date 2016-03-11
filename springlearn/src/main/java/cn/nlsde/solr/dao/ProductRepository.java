package cn.nlsde.solr.dao;

import cn.nlsde.solr.entity.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 * Created by zwj on 2016/3/11.
 */
public interface ProductRepository extends SolrCrudRepository<Product, String> {

}
