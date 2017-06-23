package review_package;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class ReviewController extends ReviewRepoController {  //handles requests in browser
    
		@RequestMapping("/allplaces")
		public String fetchReview(Model model) {
			model.addAttribute("reviewsAsMap", reviews);
			model.addAttribute("reviewsAsCollection", reviews.values());
			return "reviewIteration";
		}
	
	    @RequestMapping("/tacoreviews")
	    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        return "greeting"; //finds the greeting html folder 
	    }
}
	