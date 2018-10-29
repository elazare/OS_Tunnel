package cs131.pa2.CarsTunnels;

import cs131.pa2.Abstract.Direction;
import cs131.pa2.Abstract.Tunnel;
import cs131.pa2.Abstract.Vehicle;

public class BasicTunnel extends Tunnel{
	private int slots;
	private Direction direction;
	
	public BasicTunnel(String name) {
		super(name);
		slots = 3;
		direction = null;
	}

	@Override
	public synchronized boolean tryToEnterInner(Vehicle vehicle) {
		if(vehicle instanceof Sled) {
			if(slots >= 3) {
				slots -= 3;
				return true;
			}else {
				return false;
			}
		}else if(vehicle instanceof Car) {
			return false;
		}else {
			//TODO: Add some stuff here
			return false;
		}
	}

	@Override
	public synchronized void exitTunnelInner(Vehicle vehicle) {
		
	}
	
}
