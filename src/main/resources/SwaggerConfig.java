import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

@EnableSwagger2
public class SwaggerConfig {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//init
	
	@PostConstruct
	public void init() {
		logger.info("Initializing SwaggerConfig...");
	}
	
	//Api ddocket.
	
	//@return the docket
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.everis.alicante.courses.beca.summer17.friendsnet.controller"))
	.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}
	
	
	//Api info
	//@return the api info
	
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("Sample Application REST API","The API exposes common functionallities to " + "manage the FriendsNet", "API TOS", "Terms of service", "antonio_g.g@hotmail.es", "License of API", "API license URL");
		return apiInfo;
	}

	