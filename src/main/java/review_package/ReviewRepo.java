package review_package;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ReviewRepo  {

	protected Map<Long, TacoReview> reviews = new HashMap<>();
	
	public ReviewRepo() {
		TacoReview condadoTacos = new TacoReview(1L,"Condado", "image", 
				"9 out of 10 tacos for taste", "reviews of tacos");
		reviews.put(1L, condadoTacos);

	
	TacoReview cantinaTacos = new TacoReview(2L,"Local Cantina", "image",
			"7 out of 10 tacos for taste", "reviews of tacos");
	reviews.put(2L, cantinaTacos);
	
	}
	
	public Collection<TacoReview> findAll(){
		return reviews.values();
	}
	
	public TacoReview findOne(Long id){ //use method to return map entry
		return reviews.get(id);
	}
}	
