package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String digaOla() {
	//return "Ola Mundo Bem vindos ao primeiro exemplo do SpringBoot";
	return "<html><body><h1>Oi, Esse é um <br/>titulo</h1><hr></body></html>";
	}

	@GetMapping("/produto")
	public String mostraProduto() {
	//	String ide,str,pre;
		Produto p = new Produto();
		p.setId(9876);
		p.setDescricao("Computador Core i5 16Gb Ram  1 Tb HD Placa GTX 1080");
		p.setPreco(3500.0f);
	//return p;
//	ide = Integer.toString(p.getId());
//	pre = Float.toString(p.getPreco());
	
	//return "Id: "+ ide + "  // " + "Descricao: " + p.getDescricao() + " // " + "Preco: "+ pre;
	return "<html><body><font color='red'><b>Id: </b></font>" + "<font color='brown'><b>" + Integer.toString(p.getId()) + "</b></font>"
			+ "<br/><html><body><font color='green'><b>Descricao: </b></font>" + "<font color='brown'><b>" + p.getDescricao() + "</b></font>"
			+"<br/><html><body><font color='blue'><b>Preco: </b></font>" + "<font color='brown'><b>" + Float.toString(p.getPreco()) + "</b></font>";
	}
	
}
