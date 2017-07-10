package com.example;

public interface Job {

    void execute ( JobId id );

    void handleError ( JobId id, JobTerminationException ex );

}
