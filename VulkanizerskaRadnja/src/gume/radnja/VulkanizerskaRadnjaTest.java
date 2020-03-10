package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja vr;
	AutoGuma autoGuma;

	@Before
	public void setUp() throws Exception {
		vr = new VulkanizerskaRadnja();
		autoGuma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		vr = null;
		autoGuma = null;
	}

	@Test
	public void testDodajGumu() {
		autoGuma.setMarkaModel("Tigar Tyres 205/55");
		autoGuma.setPrecnik(18);
		autoGuma.setSirina(220);
		autoGuma.setVisina(50);
		vr.dodajGumu(autoGuma);
		assertTrue(vr.pronadjiGumu("Tigar Tyres 205/55").contains(autoGuma));
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuKojaPostoji() {
		autoGuma.setMarkaModel("Tigar Tyres 205/55");
		autoGuma.setPrecnik(18);
		autoGuma.setSirina(220);
		autoGuma.setVisina(50);
		vr.dodajGumu(autoGuma);
		vr.dodajGumu(autoGuma);
	}

	@Test
	public void testPronadjiGumuKojaNePostoji() {
		autoGuma.setMarkaModel("Tigar Tyres 205/55");
		autoGuma.setPrecnik(18);
		autoGuma.setSirina(220);
		autoGuma.setVisina(50);
		vr.dodajGumu(autoGuma);
		assertFalse(vr.pronadjiGumu("Tigar Tyres 204/44").contains(autoGuma));
	}

	@Test
	public void testPronadjiGumuKojaPostoji() {
		autoGuma.setMarkaModel("Tigar Tyres 205/55");
		autoGuma.setPrecnik(18);
		autoGuma.setSirina(220);
		autoGuma.setVisina(50);
		vr.dodajGumu(autoGuma);
		assertTrue(vr.pronadjiGumu("Tigar Tyres 205/55").contains(autoGuma));
	}

	@Test
	public void testPronadjiGumeKojePostoje() {
		autoGuma.setMarkaModel("Tigar Tyres 205/55");
		autoGuma.setPrecnik(18);
		autoGuma.setSirina(220);
		autoGuma.setVisina(50);
		vr.dodajGumu(autoGuma);

		AutoGuma autoGuma2 = new AutoGuma();
		autoGuma.setMarkaModel("Tigar Tyres 205/55");
		autoGuma.setPrecnik(19);
		autoGuma.setSirina(221);
		autoGuma.setVisina(51);
		vr.dodajGumu(autoGuma2);

		AutoGuma autoGuma3 = new AutoGuma();
		autoGuma.setMarkaModel("Tigar Tyres 205/55");
		autoGuma.setPrecnik(20);
		autoGuma.setSirina(222);
		autoGuma.setVisina(52);
		vr.dodajGumu(autoGuma3);

		AutoGuma autoGuma4 = new AutoGuma();
		autoGuma.setMarkaModel("Tigar Tyres 205/65");
		autoGuma.setPrecnik(21);
		autoGuma.setSirina(223);
		autoGuma.setVisina(53);
		vr.dodajGumu(autoGuma4);
		
		LinkedList<AutoGuma> gumeTest = new LinkedList<AutoGuma>();

		gumeTest.addFirst(autoGuma);
		gumeTest.addFirst(autoGuma2);
		gumeTest.addFirst(autoGuma3);

		assertEquals(gumeTest.size(), vr.pronadjiGumu("Tigar Tyres 205/55").size());
		assertEquals(gumeTest, vr.pronadjiGumu("Tigar Tyres 205/55"));
	}

	@Test
	public void testPronadjiGumuSaNullMarkaModel() {
		assertEquals(null, vr.pronadjiGumu(null));
	}

}
