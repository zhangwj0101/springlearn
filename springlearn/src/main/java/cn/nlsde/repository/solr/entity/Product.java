package cn.nlsde.repository.solr.entity;

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

/**
 * Created by zwj on 2016/3/11.
 */
@Data
@SolrDocument(solrCoreName = "collection1")
public class Product extends BaseEntity {

    @Id
    @Field
    @Indexed
    private String id;
    @Field
    @Indexed
    private String name;
    @Field
    @Indexed
    private String manu;
    @Field
    @Indexed
    private String manu_id_s;
    @Field
    private List<String> cat;
    @Field
    @Indexed
    private List<String> features;

    @Field
    private Integer weight;

    @Indexed
    private Float price;
    @Field
    private String price_c;
    @Field
    @Indexed
    private Integer popularity;
    @Field
    @Indexed
    private boolean inStock;
    @Field
    private String store;
    @Field
    private String manufacturedate_dt;

}
