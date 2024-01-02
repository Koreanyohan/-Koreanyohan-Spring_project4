package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity //= Jpa가 관리, Table과 연결할거라는 의미. 이거 없으면 클래스는 일반클래스.
@Table(name="tbl_member")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {

	@Id // pk지정
	@GeneratedValue(strategy = GenerationType.IDENTITY ) // auto_increament적용
	int no;
	
	String userId; // 회원 아이디
	
	String password ; // 패스워드
	
	
	
}
