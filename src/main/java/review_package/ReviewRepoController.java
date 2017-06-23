package review_package;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewRepoController {

	protected Map<String, TacoReviews> reviews = new HashMap<>();
	
	public ReviewRepoController() {
		TacoReviews tacos = new TacoReviews("Condado", "image", 59, 234, 0, "awesome");
		reviews.put("Condado", tacos);
	
		reviews.put("Las Margiritas", new TacoReviews("Las Margiritas", "image", 29, 16, 0, "awesome"));
		
		reviews.put("Taco Bell", new TacoReviews("Taco Bell", "image", 29, 16, 0, "awesome"));
		
		reviews.put("Yabos", new TacoReviews("Yabos", "image", 29, 16, 0, "awesome"));
		
		reviews.put("Local Cantina", new TacoReviews("Local Cantina", "image", 29, 16, 0, "awesome"));
	}
	
//	public Collection<Review> findAll(){
//		return null;
//	}
//	
//	public Review findOne(Long id){
//		return null;
//	}
}