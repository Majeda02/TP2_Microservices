package com.example.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao")  // Déclare cette classe comme un bean Spring avec l'identifiant "dao"
@Profile("prod")  // Ce bean sera actif uniquement avec le profil "prod"
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        // Cette implémentation retourne une valeur fixe de 100.0
        System.out.println("Version de production");
        return 100.0;
    }
}