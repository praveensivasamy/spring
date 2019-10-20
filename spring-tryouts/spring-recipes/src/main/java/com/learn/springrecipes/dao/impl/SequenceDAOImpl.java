package com.learn.springrecipes.dao.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

import com.learn.springrecipes.dao.SequenceDAO;
import com.learn.springrecipes.sequence.domain.Sequence;

@Component("sequenceDAO")
public class SequenceDAOImpl implements SequenceDAO {

    private Map<String, Sequence> sequenceMap = new HashMap<>();
    private Map<String, AtomicInteger> valuesMap = new HashMap<>();

    public SequenceDAOImpl() {
        sequenceMap.put("S1", new Sequence(1000, "PA", "SB"));
        valuesMap.put("S2", new AtomicInteger(1000));
    }

    @Override
    public Sequence getSequence(String sequenceId) {
        return sequenceMap.get(sequenceId);
    }

    @Override
    public int getNextValue(String sequenceId) {
        return valuesMap.get(sequenceId).incrementAndGet();
    }

}
