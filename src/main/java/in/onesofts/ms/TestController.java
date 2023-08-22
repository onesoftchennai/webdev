package in.onesofts.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/msg")
	public String message() {
		return "show something more now";
	}
}
