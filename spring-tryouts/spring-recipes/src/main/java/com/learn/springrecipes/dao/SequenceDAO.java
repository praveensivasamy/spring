package com.learn.springrecipes.dao;

import com.learn.springrecipes.sequence.domain.Sequence;

public interface SequenceDAO {

    public Sequence getSequence(String sequenceId);
    public int getNextValue(String sequenceId);

}
