package cn.hsiangsun.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept {
	
	private Long id;
	private String name;
	private String dbName;
	
	public Dept(String name) {
		super();
		this.name = name;
	}
	
	

}
