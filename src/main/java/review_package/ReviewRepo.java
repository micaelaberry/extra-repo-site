package review_package;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ReviewRepo {

	protected Map<Long, TacoReview> reviews = new HashMap<>();

	public ReviewRepo() {
		TacoReview condadoTacos = new TacoReview(1, "Condado", "images/condadoTacos.jpeg", "9 out of 10 tacos for taste",
				"reviews of tacos");
		reviews.put(1L, condadoTacos);

		TacoReview cantinaTacos = new TacoReview(2, "Local Cantina", "images/condadoTacos.jpeg", "7 out of 10 tacos for taste",
				"reviews of tacos");
		reviews.put(2L, cantinaTacos);

		TacoReview mimexico = new TacoReview(3, "Mi Mexico", "images/condadoTacos.jpeg", "8 out of 10 tacos for taste",
				"reviews of tacos");
		reviews.put(3L, mimexico);

	}

	public Collection<TacoReview> findAll() {
		return reviews.values();
	}

	public TacoReview findOne(Long id) { // use method to return map entry
		return reviews.get(id);
	}
}
