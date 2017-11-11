/**
 * 
 */
package cn.edu.buaa.haoli.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

/**
 * @author li
 *
 */
public class DemoThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int taskNum = 100;
		ThreadFactory demoThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
		ExecutorService cachedThreadPool = new ThreadPoolExecutor(8, 20,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(),
                demoThreadFactory,
                new ThreadPoolExecutor.AbortPolicy());
		
		for (int i = 0; i < taskNum; i++){
			cachedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread());
				}
			});
		}
		cachedThreadPool.shutdown();
		
	}

}
