package com.sikku.repo.offers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sikku.offers.Offers;

public interface IOffersRepo extends JpaRepository<Offers, Integer> {

}
