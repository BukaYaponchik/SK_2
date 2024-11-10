public class ServiceStation {
    public void check(Transport vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();

            // Проверяем прицеп только для грузовиков
            if (Truck.class == vehicle.getClass()) {
                ((Truck) vehicle).checkTrailer();
            }
        } else {
            System.out.println("Нет транспортного средства для обслуживания.");
        }
    }
}