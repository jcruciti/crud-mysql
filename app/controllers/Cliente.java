package controllers;

import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;

public class Cliente extends Controller{
	public static Result list(){
		List<models.Cliente> clientes = models.Cliente.findAll();
		    return ok(play.libs.Json.toJson(clientes));		
	}
}
