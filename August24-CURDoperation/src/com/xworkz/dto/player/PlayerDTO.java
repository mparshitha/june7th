package com.xworkz.dto.player;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
@Data
@AllArgsConstructor

public class PlayerDTO implements Serializable{
	private String name;
	private int age;
	private String nationality;
	
}
