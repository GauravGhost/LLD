package src.builderPattern;

import src.builderPattern.Product.Builder;
import src.builderPattern.Product.ProductBuilder;
import src.builderPattern.Product.ProductSchemaBuilder;

public class Director {

    public void buildDenim(Builder builder)  throws Exception{
        builder.title("denim")
                .description("A black denim jacket");
    }

    public void buildSmartphone(Builder builder)  throws Exception{
        builder.title("iPhone")
                .description("iphone 15 pro max ultra supersonic")
                .price("120000");
    }

    public void buildProduct(ProductSchemaBuilder builder, ProductBuilder productBuilder) throws Exception {
        productBuilder.title(builder.getTitle());
        productBuilder.description(builder.getDescription());
        productBuilder.rating(builder.getRating());
        productBuilder.price(builder.getPrice());
    }
}
