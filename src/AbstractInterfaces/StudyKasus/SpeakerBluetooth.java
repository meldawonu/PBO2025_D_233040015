package AbstractInterfaces.StudyKasus;

public class SpeakerBluetooth extends Perangkat {
//subclass perangkat (nama, baterai)
    public SpeakerBluetooth(String nama, int baterai) {
        super(nama, baterai);
    }

    @Override
//    override dari kelas perangkat fungsi info(aktivitas perangkat)
    public void info() {
        System.out.println("Nama Perangkat: " + nama);
    }
}
