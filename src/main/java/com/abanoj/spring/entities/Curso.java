package com.abanoj.spring.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private int idA1;
	private int idA2;
	private int idA3;
	private int idA4;
	private int idA5;
	private int idA6;
	private int idA7;
	private int idA8;
	private int idA9;
	private int idA10;
	
	public Curso() {}

	public Curso(int id) {
		this.id = id;
	}
	
	public Curso(String nombre, int ...idA) {
		this.nombre = nombre;
		for (int i = 0; i < idA.length; i++) {
			switch (i+1) {
				case 1: {
					this.idA1 = idA[i];
					break;
				}
				case 2: {
					this.idA2 = idA[i];
					break;
				}
				case 3: {
					this.idA3 = idA[i];
					break;
				}
				case 4: {
					this.idA4 = idA[i];
					break;
				}
				case 5: {
					this.idA5 = idA[i];
					break;
				}
				case 6: {
					this.idA6 = idA[i];
					break;
				}
				case 7: {
					this.idA7 = idA[i];
					break;
				}
				case 8: {
					this.idA8 = idA[i];
					break;
				}
				case 9: {
					this.idA9 = idA[i];
					break;
				}
				case 10: {
					this.idA10 = idA[i];
					break;
				}
			
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdA1() {
		return idA1;
	}

	public void setIdA1(int idA1) {
		this.idA1 = idA1;
	}

	public int getIdA2() {
		return idA2;
	}

	public void setIdA2(int idA2) {
		this.idA2 = idA2;
	}

	public int getIdA3() {
		return idA3;
	}

	public void setIdA3(int idA3) {
		this.idA3 = idA3;
	}

	public int getIdA4() {
		return idA4;
	}

	public void setIdA4(int idA4) {
		this.idA4 = idA4;
	}

	public int getIdA5() {
		return idA5;
	}

	public void setIdA5(int idA5) {
		this.idA5 = idA5;
	}

	public int getIdA6() {
		return idA6;
	}

	public void setIdA6(int idA6) {
		this.idA6 = idA6;
	}

	public int getIdA7() {
		return idA7;
	}

	public void setIdA7(int idA7) {
		this.idA7 = idA7;
	}

	public int getIdA8() {
		return idA8;
	}

	public void setIdA8(int idA8) {
		this.idA8 = idA8;
	}

	public int getIdA9() {
		return idA9;
	}

	public void setIdA9(int idA9) {
		this.idA9 = idA9;
	}

	public int getIdA10() {
		return idA10;
	}

	public void setIdA10(int idA10) {
		this.idA10 = idA10;
	}

	

}
