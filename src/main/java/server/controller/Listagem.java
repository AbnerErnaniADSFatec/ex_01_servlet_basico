package server.controller;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import server.model.Product;

public class Listagem extends HttpServlet{
    @Override
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException{
        try {
            List<Product> products = new ArrayList<Product>();

            Product prod1 = new Product();
            prod1.setId(1L);
            prod1.setName("KitKat");
            prod1.setDescription("O melhor chocolate do mundo!");
            prod1.setCurrency("R$");
            prod1.setPrice(2.10f);
            prod1.setCode("123gji35353");
            prod1.setAmount(150);
            prod1.setUnit("unid.");
            products.add(prod1);

            Product prod2 = new Product();
            prod2.setId(2L);
            prod2.setName("Snikers");
            prod2.setDescription("Amendoin e Caramelo!");
            prod2.setCurrency("R$");
            prod2.setPrice(3.10f);
            prod2.setCode("494ikfkfi9r45");
            prod2.setAmount(200);
            prod2.setUnit("unid.");
            products.add(prod2);

            Product prod3 = new Product();
            prod3.setId(3L);
            prod3.setName("Chokito");
            prod3.setDescription("Chocolate");
            prod3.setCurrency("R$");
            prod3.setPrice(1.50f);
            prod3.setCode("48rut43ty845");
            prod3.setAmount(500);
            prod3.setUnit("unid.");
            products.add(prod3);

            req.setAttribute("products", products);
            req.getRequestDispatcher("/static/estoque.jsp").forward(req, res);
        } catch (Exception e) {
            System.out.println("Erro em 10 ou Servlet");
        }
    }
}