package org.sid;

import org.sid.dao.ParametersRepository;
import org.sid.entities.Parameters;
import org.sid.entities.Product;
import org.sid.metier.IProduct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductsMngtBackEndApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ProductsMngtBackEndApplication.class, args);
		ParametersRepository paramRepo=ctx.getBean(ParametersRepository.class);
		IProduct productMetier=ctx.getBean(IProduct.class);
		
		// PRODUCTS
		Product prd1=new Product("AAA",200,150.67);
		Product prd2=new Product("BBB",300,160.77);
		Product prd3=new Product("CCC",250,153.67);
		Product prd4=new Product("DDD",270,190.67);
		Product prd5=new Product("EEE",300,180.87);
		Product prd6=new Product("FFF",400,160.67);
	    productMetier.addProduct(prd1);productMetier.addProduct(prd2);productMetier.addProduct(prd3);
	    productMetier.addProduct(prd4);productMetier.addProduct(prd5);productMetier.addProduct(prd6);
	    
		// CIH BANK
		Parameters p1=new Parameters("cih",000025,"Accueil","afficher_accueil",'y');
		Parameters p2=new Parameters("cih",000025,"Comptes","afficher_comptes",'n');
		Parameters p3=new Parameters("cih",000025,"Paiments","afficher_paiments",'y');
		Parameters p4=new Parameters("cih",000025,"Contrat","afficher_contrat",'y');
		Parameters p5=new Parameters("cih",000025,"Virement","afficher_virement",'n');
		Parameters p6=new Parameters("cih",000025,"Bénéficiaire","afficher_beneficiaire",'y');
		Parameters p7=new Parameters("cih",000025,"Reporting","afficher_reporting",'n');
		paramRepo.save(p1);paramRepo.save(p2);paramRepo.save(p3);paramRepo.save(p4);
		paramRepo.save(p5);paramRepo.save(p6);paramRepo.save(p7);
		
		// BMCE BANK
		Parameters p8=new Parameters("bmce",000050,"Accueil","afficher_accueil",'y');
		Parameters p9=new Parameters("bmce",000050,"Comptes","afficher_comptes",'y');
		Parameters p10=new Parameters("bmce",000050,"Paiments","afficher_paiments",'y');
		Parameters p11=new Parameters("bmce",000050,"Contrat","afficher_contrat",'n');
		Parameters p12=new Parameters("bmce",000050,"Virement","afficher_virement",'y');
		Parameters p13=new Parameters("bmce",000050,"Bénéficiaire","afficher_beneficiaire",'y');
		Parameters p14=new Parameters("bmce",000050,"Reporting","afficher_reporting",'y');
		paramRepo.save(p8);paramRepo.save(p9);paramRepo.save(p10);paramRepo.save(p11);
		paramRepo.save(p12);paramRepo.save(p13);paramRepo.save(p14);
		
		//show params
		for(Parameters p:paramRepo.getParams(000025)) {
		  System.out.println(p.getLibelle());
		}
		
	}

}
