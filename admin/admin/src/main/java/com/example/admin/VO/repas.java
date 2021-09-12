package com.example.admin.VO;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class repas {
	private int id;
	private String nom;
	private String descr;
	private String ingr;
	private int cal;
	private String type;
	
}
