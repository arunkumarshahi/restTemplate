import org.springframework.web.bind.annotation.RestController;

import com.sg.api.service.ApiService;

@RestController
public class ApiController {
	
	private final ApiService apiService;
	
	public ApiController(ApiService apiService) {
		this.apiService=apiService;
	}
	
	//public 

}
