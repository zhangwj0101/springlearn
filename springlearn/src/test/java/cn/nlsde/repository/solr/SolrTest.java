package cn.nlsde.repository.solr;

import cn.nlsde.base.BaseTest;
import cn.nlsde.repository.solr.dao.ProductRepository;
import cn.nlsde.repository.solr.entity.Product;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;

/**
 * Created by zwj on 2016/3/11.
 */
public class SolrTest extends BaseTest {

    final Logger logger = LoggerFactory.getLogger(SolrTest.class);
    @Autowired
    ProductRepository productRepository;


    @Test
    @Ignore
    public void testsolrTest() {
        Iterable<Product> all = productRepository.findAll();
        Iterator<Product> iterator = all.iterator();
        while (iterator.hasNext()) {
            logger.info("{}", iterator.next());
        }
    }
}
