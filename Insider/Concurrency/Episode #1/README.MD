# Insider
## Let's Explore! Series
### Episode 1 - Introduction

Hello and welcome to the first episode in this new mini-series on JavaChallenges. Today we'll start our adventure into the world of concurrency: a place where multiple lines of code are executed at the same time, contrary to the original mode that Java uses to run code.

I would like to first address a common misconception: ``Java programs are by nature single-threaded``. This is something a lot of people believe and it isn't true. Let's see why: When you start a program, the code gets ran in the JVM (Java Virtual Machine). In order to execute everything, the Virtual machine requires starting new threads otherwise named as ``JVM Internals``.

Let's start simple: how does a Java Thread work? Let me explain. Before running a thread, the Hotspot JVM needs to do some resource allocation to create a native Thread. After this process is finished, a native Thread is created. This Thread will only be "handed back" to the Operating System after the Java Thread is finished executing. What does this mean? It means that the Operating System is in charge of assigning Threads to CPUs. Anyways, after the thread has started, the code inside the ``run()`` method is ran. When the method returns (all of the code is executed), several checks are made (one for example is to check whether this was the only JVM thread running; in this case, the JVM would be terminated as well). After this process and the resources are deallocated, the threads are released.

That will top it off for this episode. I will try to keep those pretty straight to the point and informative, as I know many of you don't like long boring texts. See you next time!