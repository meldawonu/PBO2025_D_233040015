package AbstractInterfaces.StudyKasus;

public class Main {
    public static void main(String[] args) {
        SpeakerBluetooth speaker = new SpeakerBluetooth("JBL Flip 6", 73);
        speaker.info();
        speaker.sambungkan("Samsung A15");
        speaker.mainkanMusik("With an ie - JENNIE");
        speaker.statusBaterai();
    }
}
