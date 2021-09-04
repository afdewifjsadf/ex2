

public class MyFacade {
    private static MyFacade myFacadeObj = null;
        private MyFacade(){}
        public static MyFacade getMyFacadeObject(){
            if (myFacadeObj == null) {
                myFacadeObj = new MyFacade();
            } 
            return myFacadeObj;
        }

        public void classServerWOFacade(){
            ScheduleServer scheduleServer = new ScheduleServer();
            scheduleServer.startBooting();
            scheduleServer.readSystemConfigFile();
            scheduleServer.init();
            scheduleServer.initializeContext();
            scheduleServer.initializeListeners();
            scheduleServer.createSystemObjects();
            System.out.println("Start working......");
            System.out.println("After work done.........");
            scheduleServer.releaseProcesses();
            scheduleServer.destory();
            scheduleServer.destroySystemObjects();
            scheduleServer.destoryListeners();
            scheduleServer.destoryContext();
            scheduleServer.shutdown();
        }
    
}
