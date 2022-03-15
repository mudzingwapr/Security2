package com.mudzingwa.sec.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mudzingwa.sec.Repositories.Projection.IPurchaseItem;
import com.mudzingwa.sec.model.Purchase_History;

public interface Purchase_HistoryRepository extends JpaRepository<Purchase_History, Integer> {
	
	@Query("select p.title as title, ph.price as price, ph.purchaseTime as purchaseTime from Purchase_History ph left join Pencil p on p.id=ph.pencilid"
			+ "where ph.username=:userId")
     List<IPurchaseItem>findAllPurcaseOfUser(@Param("userId") Long userId);
	
}
