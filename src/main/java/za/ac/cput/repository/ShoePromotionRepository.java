package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.ShoePromotion;

@Repository
public interface ShoePromotionRepository extends JpaRepository<ShoePromotion, String> {
}
