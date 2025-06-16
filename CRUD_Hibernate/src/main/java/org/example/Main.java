package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("crudPU");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {

        // FIND
       //Cliente cliente = entityManager.find(Cliente.class, 1);
       //System.out.println("Nome do cliente:" + cliente.getNome());

        // INSERT
		//Cliente cliente = new Cliente();
		//cliente.setNome("GOOGLE");

		//entityManager.getTransaction().begin();
		//entityManager.persist(cliente);
		//entityManager.getTransaction().commit();

        // DELETE
//		Cliente cliente = entityManager.find(Cliente.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(cliente);
//		entityManager.getTransaction().commit();

        // MODIFY
//		Cliente cliente = new Cliente();
//		cliente.setId(1);
//		cliente.setNome("FACEBOOK INC.");

//		entityManager.getTransaction().begin();
//		entityManager.merge(cliente);
//		entityManager.getTransaction().commit();

 //       String jpql = "select c from Cliente c";
//		TypedQuery<Cliente> typedQuery = entityManager.createQuery(jpql, Cliente.class);
//		List<Cliente> listaCliente = typedQuery.getResultList();
//
 //		for(Cliente cliente: listaCliente) {
	//		System.out.println(cliente.getNome());
//		}


     //   String jpql = "select c from Cliente c where id = :idCliente ";
    //    int idCliente = 10;

      //  TypedQuery<Cliente> typedQuery = entityManager
   //             .createQuery(jpql, Cliente.class)
     //           .setParameter("idCliente", idCliente);
      //  List<Cliente> listaCliente = typedQuery.getResultList();

      //  for(Cliente cliente: listaCliente) {
      //      System.out.println(cliente.getNome());
       // }

        entityManager.getTransaction().begin();

//		int idCliente = 8;
//
//		entityManager.createQuery("delete from Cliente c where id = :idCliente")
//			.setParameter("idCliente", idCliente)
//			.executeUpdate();

        int idCliente = 1;

        entityManager.createQuery("update Cliente c set nome = 'FACEBOOK APP' where c.id = :idCliente")
                .setParameter("idCliente", idCliente)
                .executeUpdate();

        entityManager.getTransaction().commit();




        entityManager.close();
        entityManagerFactory.close();

    }
}