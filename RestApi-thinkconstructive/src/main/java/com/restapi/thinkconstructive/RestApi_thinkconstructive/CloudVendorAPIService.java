package com.restapi.thinkconstructive.RestApi_thinkconstructive;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	CloudVendor cv;
	
	@GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cv;
//        		new CloudVendor("C1","Vendor 1",
//                "Address One", "xxxxx");
    }
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cv) {
		this.cv = cv;
		return "Successfully created a cloud vendor";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cv) {
		this.cv = cv;
		return "Successfully updated";
	}
	
	@DeleteMapping("{id}")
	public String deleteCloudVendorDetails(String id) {
		this.cv = null;
		return "Successfully deleted";
	}
}
