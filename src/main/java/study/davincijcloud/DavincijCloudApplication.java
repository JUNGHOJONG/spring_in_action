package study.davincijcloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import study.davincijcloud.data.IngredientRepository;
import study.davincijcloud.domain.Ingredient;
import study.davincijcloud.domain.Ingredient.Type;


@SpringBootApplication
public class DavincijCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(DavincijCloudApplication.class, args);
    }

    @Bean
    /*
    @Profile("dev") // 프로덕션 환경에서 식자재 데이터 로드되는 것 방지
    @Profile({"dev", "qa"}) // dev 프로파일이나 qa 프로파일 중 하나가 활성화될 때 식자재 데이터 로드
    @Profile("!prod") // prod 프로파일이 활성화되지 않을 경우 식자재 데이터 로드
    */
    @Profile({"!prop", "!qa"}) // prod 프로파일과 qa 프로파일 모두 활성화되지 않을 경우 식자재 데이터 로드
    public CommandLineRunner dataLoader(IngredientRepository repo) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
                repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
                repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
                repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
                repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
                repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
                repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
                repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
                repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
                repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));

            }
        };
    }

}
