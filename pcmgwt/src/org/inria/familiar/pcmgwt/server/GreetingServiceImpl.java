package org.inria.familiar.pcmgwt.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.inria.familiar.pcmgwt.client.GreetingService;
import org.inria.familiar.pcmgwt.shared.PCM;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentData;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentDataCell;

import pcmmm.PcmmmPackage;

import com.google.gwt.user.client.Random;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	Resource r;
	// private EntityManager manager;
	private EntityManagerFactory factory;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		factory = Persistence.createEntityManagerFactory("mysql");
		/*
		 * models_0.add("Comparison_of_3D_computer_graphics_software.pcm");
		 * models_0.add("Comparison_of_802.15.4_radio_modules.pcm");
		 * models_0.add("Comparison_of_accounting_software.pcm");
		 * models_0.add("Comparison_of_ADC_software.pcm");
		 * models_0.add("Comparison_of_Adobe_Flex_charts.pcm");
		 * models_0.add("Comparison_of_ad_servers.pcm");
		 * models_0.add("Comparison_of_agent-based_modeling_software.pcm");
		 * models_0.add("Comparison_of_alcopops.pcm");
		 * models_0.add("Comparison_of_AMD_chipsets.pcm");
		 * models_0.add("Comparison_of_AMD_CPU_microarchitectures.pcm");
		 * models_0.add("Comparison_of_Android_devices.pcm");
		 * models_0.add("Comparison_of_Android_e-book_reader_software.pcm");
		 * models_0.add("Comparison_of_antivirus_software.pcm");
		 * models_0.add("Comparison_of_application_servers.pcm");
		 * models_0.add("Comparison_of_application_virtualization_software.pcm"
		 * ); models_0.add("Comparison_of_archive_formats.pcm");
		 * models_0.add("Comparison_of_assemblers.pcm");
		 * models_0.add("Comparison_of_ATI_chipsets.pcm");
		 * models_0.add("Comparison_of_audio_formats.pcm");
		 * models_0.add("Comparison_of_audio_player_software.pcm");
		 * models_0.add("Comparison_of_audio_synthesis_environments.pcm");
		 * models_0.add("Comparison_of_behavioral_experiment_software.pcm");
		 * models_0.add("Comparison_of_birth_control_methods.pcm");
		 * models_0.add("Comparison_of_BitTorrent_clients.pcm");
		 * models_0.add("Comparison_of_BitTorrent_sites.pcm");
		 * models_0.add("Comparison_of_BitTorrent_tracker_software.pcm");
		 * models_0.add("Comparison_of_boot_loaders.pcm");
		 * models_0.add("Comparison_of_brainwave_entrainment_software.pcm");
		 * models_0.add("Comparison_of_browser_synchronizers.pcm");
		 * models_0.add("Comparison_of_BSD_operating_systems.pcm");
		 * models_0.add("Comparison_of_business_integration_software.pcm");
		 * models_0
		 * .add("Comparison_of_Business_Process_Modeling_Notation_tools.pcm");
		 * models_0.add("Comparison_of_CAD,_CAM_and_CAE_file_viewers.pcm");
		 * models_0.add("Comparison_of_CalDAV_and_CardDAV_implementations.pcm");
		 * models_0.add("Comparison_of_California_ski_resorts.pcm");
		 * models_0.add
		 * ("Comparison_of_Canadian-tax_preparation_software_for_personal_use.pcm"
		 * ); models_0.add("Comparison_of_chess_video_games.pcm");
		 * models_0.add("Comparison_of_cluster_software.pcm");
		 * models_0.add("Comparison_of_code_generation_tools.pcm");
		 * models_0.add("Comparison_of_cognitive_architectures.pcm");
		 * models_0.add("Comparison_of_Colorado_ski_resorts.pcm");
		 * models_0.add("Comparison_of_command_shells.pcm");
		 * models_0.add("Comparison_of_consumer_brain–computer_interfaces.pcm");
		 * models_0.add("Comparison_of_continuous_integration_software.pcm");
		 * models_0.add("Comparison_of_CRM_systems.pcm");
		 * models_0.add("Comparison_of_crowd_funding_services.pcm");
		 * models_0.add("Comparison_of_C_Sharp_and_Java.pcm");
		 * models_0.add("Comparison_of_dance_video_games.pcm");
		 * models_0.add("Comparison_of_database_tools.pcm");
		 * models_0.add("Comparison_of_data_modeling_tools.pcm");
		 * models_0.add("Comparison_of_data_serialization_formats.pcm");
		 * models_0.add("Comparison_of_debuggers.pcm");
		 * models_0.add("Comparison_of_defragmentation_software.pcm");
		 * models_0.add
		 * ("Comparison_of_dental_practice_management_software.pcm");
		 * models_0.add("Comparison_of_desktop_application_launchers.pcm");
		 * models_0.add("Comparison_of_desktop_publishing_software.pcm");
		 * models_0.add("Comparison_of_development_estimation_software.pcm");
		 * models_0.add("Comparison_of_DEX_software.pcm");
		 * models_0.add("Comparison_of_digital_audio_editors.pcm");
		 * models_0.add("Comparison_of_digital_SLRs.pcm");
		 * models_0.add("Comparison_of_disc_authoring_software.pcm");
		 * models_0.add("Comparison_of_disc_image_software.pcm");
		 * models_0.add("Comparison_of_disk_cloning_software.pcm");
		 * models_0.add("Comparison_of_disk_encryption_software.pcm");
		 * models_0.add("Comparison_of_display_technology.pcm");
		 * models_0.add("Comparison_of_distributed_file_systems.pcm");
		 * models_0.add("Comparison_of_DNS_server_software.pcm");
		 * models_0.add("Comparison_of_documentation_generators.pcm");
		 * models_0.add("Comparison_of_document_interfaces.pcm");
		 * models_0.add("Comparison_of_document_markup_languages.pcm");
		 * models_0.add("Comparison_of_domestic_robots.pcm");
		 * models_0.add("Comparison_of_dosimeters.pcm");
		 * models_0.add("Comparison_of_DOS_operating_systems.pcm");
		 * models_0.add("Comparison_of_download_managers.pcm");
		 * models_0.add("Comparison_of_early_word_processors.pcm");
		 * models_0.add("Comparison_of_early_World_War_II_tanks.pcm");
		 * models_0.add("Comparison_of_e-book_formats.pcm");
		 * models_0.add("Comparison_of_e-book_readers.pcm");
		 * models_0.add("Comparison_of_EDA_software.pcm");
		 * models_0.add("Comparison_of_eDonkey_software.pcm");
		 * models_0.add("Comparison_of_educational_websites_for_children.pcm");
		 * models_0.add("Comparison_of_email_clients.pcm"); models_0.add(
		 * "Comparison_of_embedded_computer_systems_on_board_the_Mars_rovers.pcm"
		 * ); models_0.add("Comparison_of_encrypted_external_drives.pcm");
		 * models_0.add("Comparison_of_enterprise_bookmarking_platforms.pcm");
		 * models_0.add("Comparison_of_executable_file_formats.pcm");
		 * models_0.add("Comparison_of_facial_image_datasets.pcm");
		 * models_0.add("Comparison_of_fanless_layer_2_switches.pcm");
		 * models_0.add("Comparison_of_feed_aggregators.pcm");
		 * models_0.add("Comparison_of_file_archivers.pcm");
		 * models_0.add("Comparison_of_file_comparison_tools.pcm");
		 * models_0.add("Comparison_of_file_hosting_services.pcm");
		 * models_0.add("Comparison_of_file_managers.pcm");
		 * models_0.add("Comparison_of_file_synchronization_software.pcm");
		 * models_0.add("Comparison_of_file_verification_software.pcm");
		 * models_0.add("Comparison_of_firewalls.pcm");
		 * models_0.add("Comparison_of_free_and_open-source_software_licenses.pcm"
		 * ); models_0.add("Comparison_of_free_credit_report_websites.pcm");
		 * models_0.add(
		 * "Comparison_of_free_software_e-commerce_web_application_frameworks.pcm"
		 * ); models_0.add("Comparison_of_free_web_hosting_services.pcm");
		 */models_0.add("Comparison_of_802.15.4_radio_modules.pcm");
		models_0.add("Comparison_of_Adobe_Flex_charts.pcm");
		models_0.add("Comparison_of_alcopops.pcm");
		models_0.add("Comparison_of_AMD_chipsets.pcm");
		models_0.add("Comparison_of_Android_devices.pcm");
		models_0.add("Comparison_of_antivirus_software.pcm");
		models_0.add("Comparison_of_application_servers.pcm");
		models_0.add("Comparison_of_archive_formats.pcm");
		models_0.add("Comparison_of_audio_player_software.pcm");
		models_0.add("Comparison_of_birth_control_methods.pcm");
		models_0.add("Comparison_of_BitTorrent_clients.pcm");
		models_0.add("Comparison_of_boot_loaders.pcm");
		models_0.add("Comparison_of_browser_synchronizers.pcm");
		models_0.add("Comparison_of_BSD_operating_systems.pcm");
		models_0.add("Comparison_of_business_integration_software.pcm");
		models_0.add("Comparison_of_California_ski_resorts.pcm");
		models_0.add("Comparison_of_command_shells.pcm");
		models_0.add("Comparison_of_crowd_funding_services.pcm");
		models_0.add("Comparison_of_C_Sharp_and_Java.pcm");
		models_0.add("Comparison_of_dance_video_games.pcm");
		models_0.add("Comparison_of_database_tools.pcm");
		models_0.add("Comparison_of_data_serialization_formats.pcm");
		models_0.add("Comparison_of_digital_audio_editors.pcm");
		models_0.add("Comparison_of_digital_SLRs.pcm");
		models_0.add("Comparison_of_disc_authoring_software.pcm");
		models_0.add("Comparison_of_disc_image_software.pcm");
		models_0.add("Comparison_of_disk_encryption_software.pcm");
		models_0.add("Comparison_of_display_technology.pcm");
		models_0.add("Comparison_of_DNS_server_software.pcm");
		models_0.add("Comparison_of_documentation_generators.pcm");
		models_0.add("Comparison_of_document_interfaces.pcm");
		models_0.add("Comparison_of_document_markup_languages.pcm");
		models_0.add("Comparison_of_domestic_robots.pcm");
		models_0.add("Comparison_of_DOS_operating_systems.pcm");
		models_0.add("Comparison_of_download_managers.pcm");
		models_0.add("Comparison_of_e-book_readers.pcm");
		models_0.add("Comparison_of_EDA_software.pcm");
		models_0.add("Comparison_of_eDonkey_software.pcm");
		models_0.add("Comparison_of_educational_websites_for_children.pcm");
		models_0.add("Comparison_of_email_clients.pcm");
		models_0.add("Comparison_of_file_archivers.pcm");
		models_0.add("Comparison_of_file_managers.pcm");
		models_0.add("Comparison_of_file_synchronization_software.pcm");
		models_0.add("Comparison_of_file_verification_software.pcm");
		models_0.add("Comparison_of_firewalls.pcm");
		models_0.add("Comparison_of_free_web_hosting_services.pcm");
		// models.put("", 0);

	}

	public PCM loadModel(boolean demo) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"pcm", new XMIResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(PcmmmPackage.eINSTANCE.getNsURI(),
				PcmmmPackage.eINSTANCE);
//		String uris = "demo.pcm";
		String uris = "Comparison_of_portable_media_players.pcm";
			if (!demo) {
			if (models_0.size() > 0) {
				uris = models_0.get(0);
				models_0.remove(uris);
				models_1.add(uris);
			} else if (models_1.size() > 0) {
				uris = models_1.get(0);
				models_1.remove(uris);
				models_2.add(uris);
			} else if (models_2.size() > 0) {
				uris = models_2.get(0);
				models_2.remove(uris);
				models_3.add(uris);
			} else if (models_3.size() > 0) {
				uris = models_3.get(0);
				models_3.remove(uris);
				models_4.add(uris);
			} else if (models_4.size() > 0) {
				uris = models_4.get(0);
				models_4.remove(uris);
				models_5.add(uris);
			} else if (models_5.size() > 0) {
				uris = models_5.get(0);
				models_5.remove(uris);
				models_6.add(uris);

			} else {
				uris = models_6.get(Random.nextInt(models_6.size()));
			}
		}

		URI uri = URI.createFileURI(uris);

		// URI uri =
		// URI.createFileURI("Comparison_of_3D_computer_graphics_software.pcm");

		Resource r = rs.getResource(uri, true);
		System.err.println("loaded model " + r.getContents().get(0));

		PcmConverter convert = new PcmConverter();
		convert.doSwitch(r.getContents().get(0));
		convert.pcm.setName(uris);
		return convert.pcm;

	}

	@Override
	public synchronized boolean createExperimentdata(ExperimentData data,
			Collection<ExperimentDataCell> datas) {

		EntityManager manager = factory.createEntityManager();

		if (!manager.isOpen())
			manager = factory.createEntityManager();
		// EntityManager manager1 = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		if (!tx.isActive())
			tx.begin();
		data.getCells().addAll(datas);
		manager.persist(data);
		tx.commit();

		// manager.clear();
		manager.close();
		return true;

	}

	List<String> models_0 = new ArrayList<String>();
	List<String> models_1 = new ArrayList<String>();
	List<String> models_2 = new ArrayList<String>();
	List<String> models_3 = new ArrayList<String>();
	List<String> models_4 = new ArrayList<String>();
	List<String> models_5 = new ArrayList<String>();
	List<String> models_6 = new ArrayList<String>();

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		factory.close();

	}

}
