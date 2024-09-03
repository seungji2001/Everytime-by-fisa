package com.fisa.land.fisaland.market.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fisa.land.fisaland.market.entity.MarketReview;

@Repository
public interface MarketReviewRepository extends JpaRepository<MarketReview, Long> {
	List<MarketReview> findByUserEntityUserId(Long userId);
}