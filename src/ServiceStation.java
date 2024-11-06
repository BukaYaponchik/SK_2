public class ServiceStation {
    public void check(Bicycle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();

            // Проверяем прицеп только для грузовиков
            if (vehicle instanceof Truck) {
                ((Truck) vehicle).checkTrailer();
            }
        } else {
            System.out.println("Нет транспортного средства для обслуживания.");
        }
    }
}