package com.example.live.service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.live.entities.Loader;
import com.example.live.repositeries.LoderRepository;
import com.example.live.service.LoaderService;

@Service
public class LoaderServiceImpl implements LoaderService {

	@Autowired
  private LoderRepository loaderRepo;
  
	@Override
	public void saveLoader(Loader loader) {
		loaderRepo.save(loader);
		
	}

}
