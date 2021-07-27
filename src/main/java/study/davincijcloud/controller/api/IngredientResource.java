package study.davincijcloud.controller.api;

import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;
import study.davincijcloud.domain.Ingredient;
import study.davincijcloud.domain.Ingredient.Type;

@Relation(value = "ingredient", collectionRelation = "ingredients")
public class IngredientResource extends RepresentationModel<IngredientResource> {

    @Getter
    private String name;

    @Getter
    private Type type;

    public IngredientResource(Ingredient ingredient) {
        this.name = ingredient.getName();
        this.type = ingredient.getType();
    }
}
