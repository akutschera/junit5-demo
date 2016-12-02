package com.github.akutschera.extension.meta;

import org.junit.jupiter.api.extension.ExtendWith;

import com.github.akutschera.extension.mockito.MockitoExtension;
import com.github.akutschera.extension.random.RandomExtension;

/**
 * Created by Andreas Kutschera.
 */
@ExtendWith({RandomExtension.class, MockitoExtension.class})
public @interface RandomMockito {

}
