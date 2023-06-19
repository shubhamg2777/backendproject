 package com.jsp.restaurant;

import java.util.List;

import com.jsp.restaurant.Repositry.RestaurantHqlRepository;
import com.jsp.restaurant.Repositry.RestaurantRepository;
import com.jsp.restaurant.dto.RestaurantDto;
import com.jsp.restaurant.entity.RestaurantInfo;

public class App {
	public static void main(String[] args) {
//	RestaurantInfo restaurantInfo = new RestaurantInfo();
//		restaurantInfo.setName("ccd ");
//		restaurantInfo.setPincode("2548");
//		//restaurantInfo.setId(121L);
//		restaurantInfo.setAddress("chandigarh");
//	restaurantInfo.setRating("4");
//	restaurantInfo.setType("NON veg");
//		RestaurantRepository repository = new RestaurantRepository();
//	repository.saveRestaurantDetails(restaurantInfo);
//// get by id 
		// RestaurantInfo restaurant = repository.getRestaurantById(123L);
		// System.out.println(restaurant);

		// RestaurantDto restaurantDto = new RestaurantDto();
//		restaurantDto.setAddress("Varanasifgxh");
//		restaurantDto.setId(124L);
//		restaurantDto.setRating("3");
//		restaurantDto.setPincode("24356");
//// update 
		// repository.updateRestaurantDetails(restaurantDto);

//		delete 
		// repository.deleteRestaurantDetails(121L);
		// by hql ****************************************
		RestaurantHqlRepository hqlRepository = new RestaurantHqlRepository();
		// List<RestaurantInfo> restaurantList = hqlRepository.findAll();
//		restaurantList.forEach(r->{
//			System.out.println(r);
//		});

		// System.out.println(hqlRepository.findByRestaurantName("BURGER king "));
//		RestaurantDto restaurantDto = new RestaurantDto();
//		restaurantDto.setAddress("Varanasikashi");
//		restaurantDto.setId(124L);
//		restaurantDto.setPincode("24356");
//		hqlRepository.updateRestaurantById(restaurantDto);
//		
	//	hqlRepository.deleteResturantById(124L);
//		hqlRepository.deleteResturantByName("kfc");
//		hqlRepository.deleteResturantByName("kfc");
//		hqlRepository.deleteResturantByName("kfc");
//		hqlRepository.deleteResturantByName("kfc");
		RestaurantRepository repository = new RestaurantRepository();
		repository.getRestaurantById(125L);
		repository.getRestaurantById(125L);
		repository.getRestaurantById(125L);
		repository.getRestaurantById(125L);
	}
}