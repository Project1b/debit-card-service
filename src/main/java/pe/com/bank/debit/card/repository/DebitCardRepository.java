package pe.com.bank.debit.card.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import pe.com.bank.debit.card.entity.DebitCardEntity;


public interface DebitCardRepository extends ReactiveMongoRepository<DebitCardEntity, String>{

}
