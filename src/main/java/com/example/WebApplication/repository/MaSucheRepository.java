package com.example.WebApplication.repository;


import com.example.WebApplication.entity.MaSuche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MaSucheRepository extends JpaRepository<MaSuche, String> {

   /* @Query(value = "SELECT anmeldename, name, vorname, personal_nr FROM einkauf.ma_stamm", nativeQuery = true)
    List<MaSuche> findAllMaSuche();

    @Query(value = "SELECT anmeldename, name, vorname, personal_nr FROM einkauf.ma_stamm WHERE anmeldename LIKE %?1%", nativeQuery = true)
    List<MaSuche> findByNameLike(String anmeldename);

    */

    List<MaSuche> findByAnmeldenameLike(String anmeldename);


}
