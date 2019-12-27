package rest;

import com.hotel.api.dto.GuestDto;
import com.hotel.api.service.IGuestService;

@RestController
@RequestMapping(value="/guest")
public class GuestController {

	@Autowired
	private IGuestService guestService;
	
	@GetMapping(value="/{id}")
	public GuestDto getGuest(@PathVariable("id") Long id) {
		return new GuestDto(guestService.get(id));
	}
}
