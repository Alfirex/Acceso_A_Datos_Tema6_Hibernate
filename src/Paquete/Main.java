package Paquete;

import java.util.Date;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtilities.getSessionFactory().openSession();		
		
		 //-- INSERTAR EN BD: --\\
        session.beginTransaction();
        
        Empresa oEmpresa = new Empresa();
        Item oItem = new Item();
        Pedido oPedido = new Pedido();

        //-- EMPRESA: --\\
        oEmpresa.setNombre("test234");
        oEmpresa.setDireccion("aaaaaa");
        oEmpresa.setEmpleados(20);
       
        //-- ITEM: --\\
        oItem.setNombre("item234");
        oItem.setCantidad(40);

        //-- PEDIDO: --\\
        oPedido.setFecha(new Date());
        
///////////////////////////////////////////////////////////////////////////
        
        //-- GUARDAMOS LOS DATOS: --\\
        session.save(oEmpresa);
        session.save(oItem);
        session.save(oPedido);

        session.getTransaction().commit();

        //-- Obtener Valores de la BDD --\\
        session.beginTransaction();

        //-- El numero es el registro: --\\
        Empresa empresa = session.get(Empresa.class, 1);
        Item item = session.get(Item.class, 1);
        Pedido pedido = session.get(Pedido.class, 1);
        
        
        System.out.println(empresa.toString());
        System.out.println(item.toString());
        System.out.println(pedido.toString());

        session.getTransaction().commit();
        //-- Cerramos la BD --\\
        session.close();
        
        HibernateUtilities.getSessionFactory().close();
	}

}
