package com.github.pixelrunstudios.GdxTest;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;

public class IOSLauncher extends IOSApplication.Delegate implements PlatformIndependent{

	protected GdxTest core;

	@Override
	protected IOSApplication createApplication() {
		IOSApplicationConfiguration config = new IOSApplicationConfiguration();
		return new IOSApplication(new GdxTest(this), config);
	}

	public static void main(String[] argv) {
		NSAutoreleasePool pool = new NSAutoreleasePool();
		UIApplication.main(argv, null, IOSLauncher.class);
		pool.close();
	}

	@Override
	public String getPlatform(){
		return "ios";
	}

	@Override
	public void setCoreProgram(GdxTest core){
		this.core = core;
	}
}